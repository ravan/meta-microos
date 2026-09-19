SUMMARY = "Windows Subsystem for Linux distro launcher"
DESCRIPTION = "Windows application shipped within the WSL applications in the \
Windows Store. This application is initializing and launching \
the distribution."
LICENSE = "MIT"

PV = "0.0.1+git20230111.22db092"

RPM_NAME = "WSL-DistroLauncher-0.0.1+git20230111.22db092-1.7.noarch.rpm"
RPM_HASH = "84a34e8752f769712ac8193f51caaeb9297895085e48fab976ca2c99c7365907e1449ae399cd69641dda419a5adfee76ea546759312d2740f1e084157ec40804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "WSL-DistroLauncher"

RDEPENDS:${PN} += ""

inherit rpm
