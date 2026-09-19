SUMMARY = "Plymouth 'Spinfinity' theme"
DESCRIPTION = "This package contains the 'Spinfinity' boot splash theme for \
Plymouth. It features a centered logo and animated spinner that \
spins in the shape of an infinity sign."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-spinfinity-22.02.122+94.4bd41a3-20.6.noarch.rpm"
RPM_HASH = "4562da319acf0662a9f9ee764c2293e2bd3e4087fed56f0448e52ec7f607d1a4c54f2fb81c654d9bd9b0df43a7497864bd7b08517b73ea169872d7f905ffcc33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-spinfinity"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth \
plymouth-scripts"

inherit rpm
