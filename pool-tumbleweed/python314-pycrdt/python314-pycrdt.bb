SUMMARY = "Python bindings for Yrs"
DESCRIPTION = "Pycrdt is a Python CRDT library that provides bindings for Yrs, the Rust port of the Yjs framework. \
 \
Conflict-free Replicated Data Types (CRDTs) allow creating shared documents that can automatically \
merge changes made concurrently on different 'copies' of the data. When the data lives on different \
machines, they make it possible to build distributed systems that work with local data, leaving the \
synchronization and conflict resolution with remote data to the CRDT algorithm, which ensures that \
all data replicas eventually converge to the same state."
LICENSE = "MIT"

PV = "0.12.50"

RPM_NAME = "python314-pycrdt-0.12.50-1.7.aarch64.rpm"
RPM_HASH = "8fc2b4dcbf8ccad34367888aee4bfdd2730b42e0e62b3fc80c762d32f722f3ef9d6f37b3e30173994a96339f2c174de3940148c47a63770666f3abe019c7b2f5"

RPROVIDES:${PN} += "python3.14dist-pycrdt \
python314-pycrdt \
python3dist-pycrdt"

RDEPENDS:${PN} += "-python314-anyio >= 4.4 with python314-anyio < 5 \
libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
