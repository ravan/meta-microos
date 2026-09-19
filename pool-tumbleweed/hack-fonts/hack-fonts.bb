SUMMARY = "A typeface designed for source code"
DESCRIPTION = "A typeface designed for source code \
 \
Hack includes monospaced regular, bold, oblique, and bold oblique sets to cover \
all of your syntax highlighting needs. \
 \
Over 1500 glyphs that include lovingly tuned expanded Latin, modern Greek, and \
Cyrillic character sets. \
 \
Powerline glyphs are included in the regular set. Patching is not necessary. \
Install and go."
LICENSE = "Bitstream-Vera & MIT"

PV = "3.003"

RPM_NAME = "hack-fonts-3.003-2.10.noarch.rpm"
RPM_HASH = "d745aeec2bc5435ea1b6bebeb4d13b65fdf3f35e1af2f4da65272f685a66b4e464f3379ac41cfcb7bacaf85e900b0bf4228e8e9273dd45692bac8309baf4e64d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Hack \
hack-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
