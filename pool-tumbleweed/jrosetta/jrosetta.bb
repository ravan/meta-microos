SUMMARY = "API and graphical components for console"
DESCRIPTION = "JRosetta provides a common base for graphical component that could be used \
to build a graphical console in Swing with the latest requirements, such as \
command history, completion and so on for instance for scripting language \
or command line."
LICENSE = "GPL-2.0-only"

PV = "1.0.4"

RPM_NAME = "jrosetta-1.0.4-6.12.noarch.rpm"
RPM_HASH = "fc016f6c3a1c1ecad8915e8346902561bf51d88893952c0d2ca2f1336df18dea7a8231420a341e9d319dac0638bf1ab6b992333032a6eb23b41cc0bdaa23b9db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jrosetta"

RDEPENDS:${PN} += "java \
jpackage-utils"

inherit rpm
