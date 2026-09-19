SUMMARY = "Iosevka in monospace, Envy Code R style"
DESCRIPTION = "Iosevka is a sans-serif + slab-serif, monospace + quasi‑proportional \
typeface family, designed for writing code, using in terminals, and \
preparing technical documents. \
 \
This package contains the Iosevka SS10 typeface (monospace, Envy Code R style)."
LICENSE = "OFL-1.1"

PV = "34.8.1"

RPM_NAME = "iosevka-ss10-fonts-34.8.1-1.1.noarch.rpm"
RPM_HASH = "637bad550010f2e4d86f501a401803aa7aefb55959d40f680273113fc7406b75299f26ea70d4f9cc6de4f18369f3ecc3b624bddb3e5fa37be1a0f7230ffd6348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iosevka-ss10-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
