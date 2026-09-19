SUMMARY = "Fast iterable JSON parser"
DESCRIPTION = "This is a standalone version of the JSON parser used in `pydantic-core`. The recommendation is to only use this package directly if you do not use `pydantic`."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python313-jiter-0.15.0-1.3.aarch64.rpm"
RPM_HASH = "45eeff3b2c1c4ae96a04a81bf02b64d2857c3badbdb208c33eac45c4e00e08f5b8827a892eadfaf3cd2caf7e3858f1c17461d8655262e2bef20d0eb8d21b4f60"

RPROVIDES:${PN} += "python3-jiter \
python3.13dist-jiter \
python313-jiter \
python3dist-jiter"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
