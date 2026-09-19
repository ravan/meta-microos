SUMMARY = "Documentation for the GNU Core Utilities"
DESCRIPTION = "This package contains the documentation for the GNU Core Utilities."
LICENSE = "GPL-3.0-or-later"

PV = "9.11"

RPM_NAME = "coreutils-systemd-doc-9.11-5.1.noarch.rpm"
RPM_HASH = "0fb578756014d90f3d05dcfe3ec9b28c5709f602a2622ae161ac891138684de3490cd9a6e9bed45ef749f9bc5fd38e7a16ad940855e6faf529382043fa8347cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coreutils-/usr/share/info/coreutils.info.gz \
coreutils-systemd-doc"

RDEPENDS:${PN} += ""

inherit rpm
