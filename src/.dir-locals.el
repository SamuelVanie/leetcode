;;; Directory Local Variables            -*- no-byte-compile: t -*-
;;; For more information see (info "(emacs) Directory Variables")

((nil . ((eval . (local-set-key (kbd "<f5>")
				(lambda nil
				  (interactive)
				  (shell-command
				    "find -type f -name '*.class' | xargs -I{} rm {}"))))
	 (eval . (local-set-key (kbd "<f8>")
				(lambda nil (interactive)
				  (setq-local compile-command
					      "java -cp junit-4.13.2.jar:hamcrest-3.0.jar:. org.junit.runner.JUnitCore ")
				  (project-compile))))
	 (eval . (local-set-key (kbd "<f9>")
				(lambda nil (interactive)
				  (setq-local compile-command
					      "javac -cp junit-4.13.2.jar:hamcrest-3.0.jar:. ")
				  (project-compile)))))))
