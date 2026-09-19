SUMMARY = "A Sans-Serif Font for Use as Primary Interface Font"
DESCRIPTION = "Aurulent Sans is a humanist sans serif intended to be used as an \
interface font. The width and style is reminiscent of Luxi Sans, \
Lucida Sans, Tahoma, and Andale Sans UI. Aurulent currently ha \
s four styles: regular, italic, bold, and bold italic. \
 \
Designer: Stephen G. Hartke"
LICENSE = "OFL-1.1"

PV = "20070504"

RPM_NAME = "hartke-aurulentsans-fonts-20070504-7.25.noarch.rpm"
RPM_HASH = "46d73aca6520e1f64a52a2e61abec0c4fe47885c68497a2e960c18694c6306ccefd77b5f1adc7bc6b944fef43325ab74cb0cdfd69298f0ef0cb2ac4dd7c5881e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hartke-aurulentsans-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
