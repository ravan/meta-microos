SUMMARY = "Displays Octoprint status"
DESCRIPTION = "Displays the Octoprint status and the printer's bed/tools temperature in the status bar."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-octoprint-2.1.5-4.7.noarch.rpm"
RPM_HASH = "531503f625935e3f01cb9a3c8593392b7a402772c741abbf387e019254cb2f7ff0dc345eabbd75cb92f8297ca758a1e06ebd77f56f395f4333651fc449f1289a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-octoprint"

RDEPENDS:${PN} += "bumblebee-status \
python3-Pillow-tk \
python3-simplejson"

inherit rpm
