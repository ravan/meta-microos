SUMMARY = "Widget to show status for numlock, scrolllock and capslock"
DESCRIPTION = "Displays the indicator status for numlock, scrolllock and capslock."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-indicator-2.1.5-4.7.noarch.rpm"
RPM_HASH = "a4dce5b3705af368e98ce5d10aa6044af01fd0571fd0e6780b2fb420df34e13da11b962fa63923ed534f9e4df492fbfcf38a708314ed0f7fa4235ccaa181f8eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-indicator"

RDEPENDS:${PN} += "bumblebee-status \
xset"

inherit rpm
