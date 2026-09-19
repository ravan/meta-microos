SUMMARY = "Electron API documentation"
DESCRIPTION = "Development documentation for the Electron runtime."
LICENSE = "Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Source-Code & bzip2-1.0.6 & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "37.10.2"

RPM_NAME = "nodejs-electron-doc-37.10.2-3.7.noarch.rpm"
RPM_HASH = "862bb5f3823518928ae3e751af14b08a59db215a739d9b8b7c53e3242a0787cf10b1557a39279325cef7091240ad326b647a48aae073058d0efe9d30ae85732b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nodejs-electron-doc"

RDEPENDS:${PN} += ""

inherit rpm
