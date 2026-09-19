SUMMARY = "An AST unparser for Python"
DESCRIPTION = "This is a factored out version of ``unparse`` found in the Python \
source distribution; under Demo/parser in Python 2 and under \
Tools/parser in Python 3. \
 \
This library is single-source compatible with Python 2.6 through \
Python 3.5. It is authored by the Python core developers; I have \
simply merged the Python 2.7 and the Python 3.5 source and test \
suites, and added a wrapper. This factoring out is to provide a \
library implementation that supports both versions. \
 \
Added to this is a pretty-printing dump utility function."
LICENSE = "BSD-3-Clause & Python-2.0"

PV = "1.6.3"

RPM_NAME = "python313-astunparse-1.6.3-8.8.aarch64.rpm"
RPM_HASH = "5045f6bd2ecb57a60d679545dcbbf369962317d149fb7cc9575c017370f34dd9f91ec8f5c5db88e838744fe70717aad0ca21df48e24cdc039ac3871499c12627"

RPROVIDES:${PN} += "python3-astunparse \
python3.13dist-astunparse \
python313-astunparse \
python3dist-astunparse"

RDEPENDS:${PN} += "python-abi \
python313-six \
python313-wheel"

inherit rpm
