SUMMARY = "Claude Garamont's designs go open source"
DESCRIPTION = "Garamont’s fonts represent a milestone in the history of type design, \
a touchstone to which font designers have been returning ever since. EB Garamond \
is an open source project to create a revival of Claude Garamont’s famous \
humanist typeface from the mid-16th century. Its design reproduces the original \
by Claude Garamont: The source for the letterforms is a scan of a specimen known \
as the “Berner specimen”, which, composed in 1592 by Conrad Berner, son-in-law \
of Christian Egenolff and his successor at the Egenolff print office, shows \
Garamont’s roman and Granjon’s italic fonts at different sizes. Hence the name \
of this project: Egenolff-Berner Garamond."
LICENSE = "OFL-1.1"

PV = "0.016"

RPM_NAME = "eb-garamond-fonts-0.016-1.24.noarch.rpm"
RPM_HASH = "936f2fba9d69c43074dc14c90f0099d5819bf5f845a517c2a50950d2a0836e7f3f434acf14a3ff9bab4c43ae5f750a11431e1d66e29b3ca9631feda89743f5f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eb-garamond \
eb-garamond-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
