SUMMARY = "Safely login with ProtonVPN credentials to connect to Proton"
DESCRIPTION = "This package, originally forked from python-srp module implements a simple \
wrapper to Proton Technologies API, abstracting from the SRP authentication."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python313-proton-client-0.7.1-4.2.noarch.rpm"
RPM_HASH = "f2861d882f3281811ca9da85972652d4eb9fc38c4c329d04f7ac4947d8b4ebd618ff2673e123494dfd37b9065c4b5c34993b059eb030eea94bddc5780ae0e0bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proton-client \
python3.13dist-proton-client \
python313-proton-client \
python3dist-proton-client"

RDEPENDS:${PN} += "python-abi \
python313-bcrypt \
python313-gnupg \
python313-pyOpenSSL \
python313-requests"

inherit rpm
