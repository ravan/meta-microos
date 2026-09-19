SUMMARY = "SUSE font"
DESCRIPTION = "SUSE is a sans serif typeface designed by René Bieder, embodying a unique \
hybrid between geometric and monospaced features. It captures the essence of \
SUSE, a company renowned for its open-source solutions. This versatile typeface \
family includes the following styles: Thin, ExtraLight, Light, Regular, Medium, \
SemiBold, Bold, and ExtraBold."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "suse-fonts-2.001-1.3.noarch.rpm"
RPM_HASH = "588cb81803db7ab61fba92528de40d1566510843bf6887b8f8a5e28b6c3fae6fbd4effb8e875ccfb0a9ee6a143932c33e3c673ee589796bb850f70c97672c86a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "suse-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
