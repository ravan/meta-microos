SUMMARY = "Python 3 port of sgmllib"
DESCRIPTION = "Python 3 port of Python 2's standard library `sgmllib`."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "1.0.0"

RPM_NAME = "python314-sgmllib3k-1.0.0-6.5.noarch.rpm"
RPM_HASH = "7bf100ba01033be23d63d07a579094f94278bae5dc0e9ef5b7c1de47de802aec750a3257706d147adff7362e9cbf4cc65f353ea7935afda3523516af6f3e6c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sgmllib3k \
python314-sgmllib3k \
python3dist-sgmllib3k"

RDEPENDS:${PN} += "python-abi"

inherit rpm
