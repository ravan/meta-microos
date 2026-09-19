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

RPM_NAME = "python314-samplerate-0.2.4-1.4.aarch64.rpm"
RPM_HASH = "0fb6a2162b6b8bb9ea17e9e76acdb368d55455c969518c0a2c959cc1a2267001f4bb9dac27af70ae207742013352c508c289fa98a323e20f05e79f3bca18fb3a"

RPROVIDES:${PN} += "python3.14dist-samplerate \
python314-samplerate \
python3dist-samplerate"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libsamplerate.so.0 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
