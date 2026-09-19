SUMMARY = "A logging replacement for Python"
DESCRIPTION = "An alternative logging implementation for python."
LICENSE = "BSD-3-Clause"

PV = "1.10.1"

RPM_NAME = "python313-Logbook-1.10.1-1.1.aarch64.rpm"
RPM_HASH = "da596ca22b2152d7b3ba103bccec4b4ebbe6acb27a8ced788cc6580c2503e70ffe2861031d93be9edd64bd5d8665d4fa744eb751953942133db4628942b35617"

RPROVIDES:${PN} += "python3-Logbook \
python3.13dist-logbook \
python313-Logbook \
python3dist-logbook"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python313-typing-extensions"

inherit rpm
