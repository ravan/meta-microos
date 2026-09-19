SUMMARY = "Python library for kaitaistruct"
DESCRIPTION = "This library implements the Kaitai Struct API for Python. \
 \
Kaitai Struct is a declarative language used to describe various binary data \
structures, laid out in files or in memory: i.e. binary file formats, network \
stream packet formats, etc. \
 \
It is similar to Python’s [construct] and [Construct3], but it is \
language-agnostic. \
The format description is done in YAML-based .ksy format, which then can be \
compiled into a wide range of target languages."
LICENSE = "MIT"

PV = "0.11"

RPM_NAME = "python313-kaitaistruct-0.11-1.4.noarch.rpm"
RPM_HASH = "c93f76053284d89811ba2a21e2126fcf4766660b71ecb0ae4a8c26822f4b1bb1f5145dddd579e50b0976e4fef9cdf64db1c093d86e8ffe84d3fed60fa0d7426d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kaitaistruct \
python3.13dist-kaitaistruct \
python313-kaitaistruct \
python3dist-kaitaistruct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
