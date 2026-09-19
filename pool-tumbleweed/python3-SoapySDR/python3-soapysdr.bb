SUMMARY = "Python bindings for SoapySDR"
DESCRIPTION = "Python Bindings for SoapySDR. \
A vendor neutral and platform independent SDR support library."
LICENSE = "BSL-1.0"

PV = "0.8.1+git20250223.6e99da1"

RPM_NAME = "python3-SoapySDR-0.8.1+git20250223.6e99da1-2.6.aarch64.rpm"
RPM_HASH = "df373685977a465b5f7153a066d13b17df686320e9044493e5b3dbbdb86ecebf344b2a591bfd0399ea57f6f5853430233c86f85cf38dcf6ded86c3a295de337f"

RPROVIDES:${PN} += "python-soapy-sdr \
python3-SoapySDR"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
