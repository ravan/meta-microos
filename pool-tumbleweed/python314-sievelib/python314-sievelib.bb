SUMMARY = "Client-side Sieve and Managesieve library written in Python"
DESCRIPTION = "Client-side Sieve and Managesieve library written in Python. \
* Sieve: An Email Filtering Language (RFC 5228) \
* ManageSieve: A Protocol for Remotely Managing Sieve Scripts (RFC 5804)"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python314-sievelib-1.5.0-1.3.noarch.rpm"
RPM_HASH = "0eae0f1b0e5806fc18ecc5c5af8710129050307c256926a31276f400d306e6d2da84a52fd08a8530c75d26162b2af3a2fd26684a7af1c505cc29facfea4aaf02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sievelib \
python314-sievelib \
python3dist-sievelib"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
