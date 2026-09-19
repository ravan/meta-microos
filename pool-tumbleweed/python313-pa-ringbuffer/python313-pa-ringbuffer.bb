SUMMARY = "Python wrapper for PortAudio's ring buffer"
DESCRIPTION = "The ring buffer functionality is typically not included in binary \
distributions of PortAudio, therefore most Python wrappers don't include it, \
either. \
 \
The pa_ringbuffer module provides only a Python wrapper, the actual \
PortAudio ring buffer code has to be compiled separately. \
It can be used on any Python version where CFFI is available. \
 \
This module is designed to be used together with the sounddevice module (it \
might work with other modules, too) for non-blocking transfer of data between \
the main Python program and an audio callback function which is implemented in C \
or some other compiled language. \
 \
This module is not meant to be used on its own, it is only useful in cooperation \
with another Python module using CFFI."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "python313-pa-ringbuffer-0.1.4-2.5.noarch.rpm"
RPM_HASH = "8222b88bdbbc1f105d8ee7dbeabebecb2861dc93274eef31cf885cf94c0a587a9d7aa9ba48b0a9f91a67278daf54f73fcfd3d057b16bae247340e80963c358f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pa-ringbuffer \
python3.13dist-pa-ringbuffer \
python313-pa-ringbuffer \
python3dist-pa-ringbuffer"

RDEPENDS:${PN} += "python-abi \
python313-cffi"

inherit rpm
