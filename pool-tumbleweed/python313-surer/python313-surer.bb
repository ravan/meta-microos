SUMMARY = "Idiomatic assertion toolkit with human-friendly failure messages"
DESCRIPTION = "An idiomatic testing library for python with powerful and flexible assertions. \
Inspired and modeled after RSpec Expectations and should.js."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.3"

RPM_NAME = "python313-surer-0.0.3-3.4.noarch.rpm"
RPM_HASH = "c9c9551bfcdf806d837b367b88ad2c57e5bf9af7a1b24c7da80e3cc8f89abb9cc67e6a61d7e6c4c294e369ef2ff36a8330c51d7dd771ddea8868e7a81053dcfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-surer \
python3.13dist-surer \
python313-surer \
python3dist-surer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
