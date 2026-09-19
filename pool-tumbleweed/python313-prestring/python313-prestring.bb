SUMMARY = "Python source code generation library"
DESCRIPTION = "Python source code generation library (with overuse with-syntax)."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python313-prestring-0.9.0-4.4.noarch.rpm"
RPM_HASH = "e760d04342b5b80a47b272d18c428b91972df033a3d7cb3a17b3c7023d7a0ccd0ee65d02dcb8a51aa07f0fcf280a6532d6ea0b9280d968bba73d72bd3352d731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-prestring \
python3.13dist-prestring \
python313-prestring \
python3dist-prestring"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
