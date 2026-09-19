SUMMARY = "Library That Implements Different Microsoft Compressions"
DESCRIPTION = "The purpose of libmspack is to provide both compression and \
decompression of some loosely related file formats used by Microsoft. \
Currently the most common formats are implemented. \
 \
This subpacke provides useful programs that make use of libmspack. \
 * cabd_memory - An implementation of the mspack_system interface using \
                 only memory \
 * cabrip      - Extracts any CAB files embedded in another file. \
 * chmextract  - Extracts all files in a CHM file to disk. \
 * msexpand    - Expands an SZDD or KWAJ file. \
 * multifh     - An implementation of the mspack_system interface which \
                 can access many things: regular disk files, already \
                 opened stdio FILE*  file pointers, open file \
                 descriptors, blocks of memory \
 * oabextract  - Extracts an Exchange Offline Address Book (.LZX) file."
LICENSE = "LGPL-2.1-only"

PV = "0.11"

RPM_NAME = "mspack-examples-0.11-2.11.aarch64.rpm"
RPM_HASH = "240a7e5af70e9214b0635d20bdd27c9b39d998094ae66e02e309cf56bde4126143e23a519568dec7e1f1b51abe3dace082a4358705f80222887e3c6c13376c05"

RPROVIDES:${PN} += "mspack-examples \
mspack-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmspack.so.0"

inherit rpm
