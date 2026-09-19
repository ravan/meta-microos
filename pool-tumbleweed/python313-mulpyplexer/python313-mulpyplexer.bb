SUMMARY = "A module that multiplexes interactions with lists of python objects"
DESCRIPTION = "Mulpyplexer is a piece of code that can multiplex interactions with lists of python objects."
LICENSE = "BSD-2-Clause"

PV = "0.09"

RPM_NAME = "python313-mulpyplexer-0.09-2.5.noarch.rpm"
RPM_HASH = "45e177fd9aa0d882cb10253490a1593f538067abbef9a446d103466d53437a9d36d3e4ca64b887e076f46e761d581c52bfe46b6c88fd34ef464500d814d14de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mulpyplexer \
python3.13dist-mulpyplexer \
python313-mulpyplexer \
python3dist-mulpyplexer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
