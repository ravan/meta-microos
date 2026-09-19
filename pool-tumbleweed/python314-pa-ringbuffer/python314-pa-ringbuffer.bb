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

RPM_NAME = "python314-pa-ringbuffer-0.1.4-2.5.noarch.rpm"
RPM_HASH = "44f9857405a182b7f3538f84d357517cbf9713566861348ed9b19b6f13646ec81dfa18c83de0e8a0224a79f4e2f17273cb05993270148fe7764fff985414fe3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pa-ringbuffer \
python314-pa-ringbuffer \
python3dist-pa-ringbuffer"

RDEPENDS:${PN} += "python-abi \
python314-cffi"

inherit rpm
