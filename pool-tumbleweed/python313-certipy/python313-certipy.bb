SUMMARY = "Create and sign CAs and certificates"
DESCRIPTION = "Create and sign CAs and certificates."
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python313-certipy-0.2.3-1.2.noarch.rpm"
RPM_HASH = "2f8581aa7d322e1c6593cf5f6d7716eb198ccc00518ad5163aa79bdf6de510509e84cee367b6f622659eda92d42bd5ca6d7b224fcaafe26db2b4a15341a4e7f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certipy \
python3.13dist-certipy \
python313-certipy \
python3dist-certipy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-cryptography"

inherit rpm
