SUMMARY = "Java API to display mathematical formulas written in LaTeX"
DESCRIPTION = "The goal of this Java API is to display mathematical formulas written in LaTeX. \
The default encoding is UTF-8 and most of LaTeX commands are available. \
 \
JLaTeXMath is a fork of the excellent project JMathTeX."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "jlatexmath-1.0.3-7.8.noarch.rpm"
RPM_HASH = "b201d837a5451a3a2cbfdf6980b9eb7c16dedff1fdbce970994ef096fd5c35bf5c71b10ee11e0e28e6bb781d465088b936b6ccfb51a55c019960ae2640eea102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jlatexmath"

RDEPENDS:${PN} += "java \
javapackages-tools"

inherit rpm
