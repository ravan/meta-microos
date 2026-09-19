SUMMARY = "Python bindings for libsamplerate"
DESCRIPTION = "This is a wrapper around Erik de Castro Lopo's libsamplerate (aka Secret \
Rabbit Code) for sample rate conversion. \
 \
It implements all three APIs available in libsamplerate: \
 \
* Simple API: for resampling a large chunk of data with a single library \
  call \
* Full API: for obtaining the resampled signal from successive chunks of \
  data \
* Callback API: like Full API, but input samples are provided by a callback \
  function"
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "python313-samplerate-0.2.4-1.4.aarch64.rpm"
RPM_HASH = "7bf4833a883a94a169901f4122d3c847bee6844cae26749f333ac04dac6fd6430b901d56c3f2a721d5ca9742d583be24987e5bfc16f493be9c6afbf8356f3352"

RPROVIDES:${PN} += "python3-samplerate \
python3.13dist-samplerate \
python313-samplerate \
python3dist-samplerate"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libsamplerate.so.0 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
