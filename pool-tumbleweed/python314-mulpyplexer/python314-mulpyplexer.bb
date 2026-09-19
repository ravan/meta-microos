SUMMARY = "A module that multiplexes interactions with lists of python objects"
DESCRIPTION = "Mulpyplexer is a piece of code that can multiplex interactions with lists of python objects."
LICENSE = "BSD-2-Clause"

PV = "0.09"

RPM_NAME = "python314-mulpyplexer-0.09-2.5.noarch.rpm"
RPM_HASH = "5d7cf2c35607929caacb5175c72c492e9d845bfd742d7e8422c5827e0132a105c876dd232bf9d7a0dc248f1f1fedb0f2bdce59319d7e008f7dde12b4e33652ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mulpyplexer \
python314-mulpyplexer \
python3dist-mulpyplexer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
