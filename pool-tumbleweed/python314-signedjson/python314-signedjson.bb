SUMMARY = "Python module to sign JSON with Ed25519 signatures"
DESCRIPTION = "Features: \
 \
* More than one entity can sign the same object. \
* Each entity can sign the object with more than one key making it easier to \
  rotate keys \
* ED25519 can be replaced with a different algorithm. \
* Unprotected data can be added to the object under the 'unsigned' key."
LICENSE = "Apache-2.0"

PV = "1.1.4"

RPM_NAME = "python314-signedjson-1.1.4-4.5.noarch.rpm"
RPM_HASH = "c7e95029522893c6365c57d775fa84b50070c8bf0ada16fd5a4c5c91d9b453f55da767ddc78cb943376508a2dc22caa8c9837faffa65b7164f4253d0b064e76f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-signedjson \
python314-signedjson \
python3dist-signedjson"

RDEPENDS:${PN} += "python-abi \
python314-PyNaCl \
python314-canonicaljson \
python314-importlib-metadata \
python314-typing-extensions \
python314-unpaddedbase64"

inherit rpm
