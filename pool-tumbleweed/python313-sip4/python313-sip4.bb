SUMMARY = "SIP tool to use python sip bindings - legacy version 4"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package provides the legacy version 4 of the SIP tool"
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python313-sip4-4.19.25-8.6.aarch64.rpm"
RPM_HASH = "9c81df49d10495f7ba45287fc6d776d40250bf3b86ae79691b42ab11cfb6806a28d9c44cc63e4f34213dad5790a1a57e0fd2f919df4f79d64b4f66017bbd9cb3"

RPROVIDES:${PN} += "python3-sip \
python3-sip-api \
python3-sip4 \
python3.13dist-sip \
python313-sip \
python313-sip-api \
python313-sip4 \
python3dist-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
python-abi \
python313-sip4-common"

inherit rpm
