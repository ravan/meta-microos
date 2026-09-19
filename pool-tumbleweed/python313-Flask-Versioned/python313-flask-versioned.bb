SUMMARY = "Add version info to file paths"
DESCRIPTION = "Add version info to file paths."
LICENSE = "BSD-3-Clause"

PV = "0.9.4"

RPM_NAME = "python313-Flask-Versioned-0.9.4-5.1.noarch.rpm"
RPM_HASH = "00be25151e4a6b83563973a57207c82b22083aca0db0a8a8eeec3b9f29ce711141629b1634f776589b998a29e6a827950324fc195b9ef89abb76a552c90a7c29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Versioned \
python3.13dist-flask-versioned \
python313-Flask-Versioned \
python3dist-flask-versioned"

RDEPENDS:${PN} += "python-abi \
python313-Flask \
python313-setuptools"

inherit rpm
