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

RPM_NAME = "python313-signedjson-1.1.4-4.5.noarch.rpm"
RPM_HASH = "fabc2c64b701aad9c97e57e293bf1d49c1f3c132775b29abb345c802aa4f553e12911a5f858e94c7610d1e4929c871edd502c424e0d14d663dfab6a8cf4452dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-signedjson \
python3.13dist-signedjson \
python313-signedjson \
python3dist-signedjson"

RDEPENDS:${PN} += "python-abi \
python313-PyNaCl \
python313-canonicaljson \
python313-importlib-metadata \
python313-typing-extensions \
python313-unpaddedbase64"

inherit rpm
