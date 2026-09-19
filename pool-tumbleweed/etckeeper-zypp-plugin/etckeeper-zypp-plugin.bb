SUMMARY = "The etckeeper integration function with ZYpp"
DESCRIPTION = "The etckeeper-zypp-plugin calls etckeeper from ZYpp."
LICENSE = "GPL-2.0-or-later"

PV = "1.18.22"

RPM_NAME = "etckeeper-zypp-plugin-1.18.22-1.4.noarch.rpm"
RPM_HASH = "523507d52197b6bbcbd22f16a4df75e6a9aa02d825e3004ea9630d119484ea27226fff61631ce7f6c051854be3230a4f4340cd9a6ec5e826f049d6b916480218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "etckeeper-/usr/lib/zypp/plugins/commit/zypper-etckeeper.py \
etckeeper-pkgmanager-collabo \
etckeeper-zypp-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
etckeeper \
python3-zypp-plugin"

inherit rpm
