SUMMARY = "Cryptographic patch attestation for the masses"
DESCRIPTION = "This utility allows an easy way to add end-to-end cryptographic attestation to \
patches sent via mail. It does so by adapting the DKIM email signature standard \
to include cryptographic signatures via the X-Developer-Signature email header. \
 \
If your project workflow doesn't use patches sent via email, then you don't \
need this and should simply start signing your tags and commits."
LICENSE = "MIT-0"

PV = "0.8.0"

RPM_NAME = "python313-patatt-0.8.0-1.1.noarch.rpm"
RPM_HASH = "5dd8b3f626efeeddfbff38645b811ace278e6b3d1f3e22d03ce10d7c45c029391cb8b95659057023ecf96a4a184b4a9f614b77e92bd0abe4b52e0d1638fa8cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-patatt \
python3.13dist-patatt \
python313-patatt \
python3dist-patatt"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyNaCl"

inherit rpm
