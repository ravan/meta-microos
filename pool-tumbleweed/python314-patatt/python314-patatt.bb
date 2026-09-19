SUMMARY = "Cryptographic patch attestation for the masses"
DESCRIPTION = "This utility allows an easy way to add end-to-end cryptographic attestation to \
patches sent via mail. It does so by adapting the DKIM email signature standard \
to include cryptographic signatures via the X-Developer-Signature email header. \
 \
If your project workflow doesn't use patches sent via email, then you don't \
need this and should simply start signing your tags and commits."
LICENSE = "MIT-0"

PV = "0.8.0"

RPM_NAME = "python314-patatt-0.8.0-1.1.noarch.rpm"
RPM_HASH = "755a743d3641d47629dde500cc2f1e163055f8038198cc7aa006c6d345626d4d528a57ce8153a647a2fc62fe8a449473e06ce4c73b8234835443090c750c1d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-patatt \
python314-patatt \
python3dist-patatt"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyNaCl"

inherit rpm
