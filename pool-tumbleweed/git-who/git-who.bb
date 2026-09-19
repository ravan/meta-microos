SUMMARY = "Git blame for file trees"
DESCRIPTION = "git-who is a command-line tool for answering that eternal question: \
 \
    Who wrote this code?! \
 \
Unlike git blame, which can tell you who wrote a line of code, git-who tells \
you the people responsible for entire components or subsystems in a codebase. \
You can think of git-who sort of like git blame but for file trees rather than \
individual files."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "git-who-1.3-1.7.aarch64.rpm"
RPM_HASH = "f18924d84d5a5308c8e4e0ce8d9b30daf351021aa370c00917ba5aa02e544f93589748341e910c2f7565e258c90523e82ea6309b64de44ea8b061fb1108b882f"

RPROVIDES:${PN} += "git-who"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
