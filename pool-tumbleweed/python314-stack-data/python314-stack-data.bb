SUMMARY = "Extract data from python stack frames and tracebacks"
DESCRIPTION = "Extract data from python stack frames and tracebacks for informative displays"
LICENSE = "MIT"

PV = "0.6.3"

RPM_NAME = "python314-stack-data-0.6.3-4.3.noarch.rpm"
RPM_HASH = "e9ff0e2408fdd75c902eb9d9d352ba4ae9c9a5c304b4b30abf83b665d983047c927332eb35dcdc40fbf11d382398403af0ab2eb75d32fab6a082e244459c623b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-stack-data \
python314-stack-data \
python3dist-stack-data"

RDEPENDS:${PN} += "python-abi \
python314-asttokens \
python314-executing \
python314-pure-eval"

inherit rpm
