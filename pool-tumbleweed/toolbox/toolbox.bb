SUMMARY = "Script to start a toolbox container for system debugging"
DESCRIPTION = "On systems using transactional-update it is not really possible due to \
the read-only root filesystem to install tools to analyze problems in the \
currently running system, a reboot is always required. Which makes it next \
to impossible to debug such problems. toolbox is a small script that launches \
a container to let you bring in your favorite debugging or admin tools in \
such a system. The root filesystem can be found at /media/root."
LICENSE = "Apache-2.0"

PV = "2.4+git20260421.7c75c12"

RPM_NAME = "toolbox-2.4+git20260421.7c75c12-1.2.noarch.rpm"
RPM_HASH = "d172cdfec2d821e5e007d36dcca01a34d686ed14f338122825db316c784de76e32581779dc08514a453b94b86a2e770d159b300a7db6a736fb9ac89e80051d04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-toolbox \
toolbox"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
