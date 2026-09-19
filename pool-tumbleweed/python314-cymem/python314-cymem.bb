SUMMARY = "Manage calls to calloc/free through Cython"
DESCRIPTION = " \
 \
cymem provides two small memory-management helpers for Cython. They make it \
easy to tie memory to a Python object's life-cycle, so that the memory is freed \
when the object is garbage collected. \
 \
 \
 \
The most useful is `cymem.Pool`, which acts as a thin wrapper around the calloc \
function: \
 \
```python \
from cymem.cymem cimport Pool \
cdef Pool mem = Pool() \
data1 = <int*>mem.alloc(10, sizeof(int)) \
data2 = <float*>mem.alloc(12, sizeof(float)) \
``` \
 \
The `Pool` object saves the memory addresses internally, and frees them when the \
object is garbage collected. Typically you'll attach the `Pool` to some cdef'd \
class. This is particularly handy for deeply nested structs, which have \
complicated initialization functions. Just pass the `Pool` object into the \
initializer, and you don't have to worry about freeing your struct at all — \
all of the calls to `Pool.alloc` will be automatically freed when the `Pool` \
expires."
LICENSE = "MIT"

PV = "2.0.13"

RPM_NAME = "python314-cymem-2.0.13-1.5.aarch64.rpm"
RPM_HASH = "a80bc057ed8a5861e93cfb64ea08a86fb739255ea6898ec8b7bcd87fc253ea94661c86a62126920464d6d4c47b5b92203c9cbef87e8a6d049e4d5b089a0ff689"

RPROVIDES:${PN} += "python3.14dist-cymem \
python314-cymem \
python3dist-cymem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
