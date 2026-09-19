SUMMARY = "Safely login with ProtonVPN credentials to connect to Proton"
DESCRIPTION = "This package, originally forked from python-srp module implements a simple \
wrapper to Proton Technologies API, abstracting from the SRP authentication."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python314-proton-client-0.7.1-4.2.noarch.rpm"
RPM_HASH = "2cf371153e408784bdd2d555fec5a7cddf7d2eed7cbd6ced2aead8397d3a3bb0a4d4720ed21143a4fdf1cb153a0106f729ed48314caaf205db5f8cf1caad8127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-proton-client \
python314-proton-client \
python3dist-proton-client"

RDEPENDS:${PN} += "python-abi \
python314-bcrypt \
python314-gnupg \
python314-pyOpenSSL \
python314-requests"

inherit rpm
