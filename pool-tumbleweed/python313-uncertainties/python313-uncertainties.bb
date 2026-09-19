SUMMARY = "Uncertainties on the Quantities Involved (aka 'Error Propagation')"
DESCRIPTION = "'uncertainties' allows calculations such as (2±0.1)*2 = 4±0.2 to be \
performed transparently. Much more complex mathematical expressions \
involving numbers with uncertainties can also be evaluated directly."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "python313-uncertainties-3.2.3-1.5.noarch.rpm"
RPM_HASH = "a5443d43009891bf9990fa9bf30b97f05c7cacbb7a4d18f9160d3dfaa84fab6e2917f5fb99fa98960430f55521bfdd873efca516679e3b5a91bf4aa1e5ff6ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uncertainties \
python3.13dist-uncertainties \
python313-uncertainties \
python3dist-uncertainties"

RDEPENDS:${PN} += "python-abi"

inherit rpm
