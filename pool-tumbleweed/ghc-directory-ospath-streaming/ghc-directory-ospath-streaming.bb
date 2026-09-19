SUMMARY = "Stream directory entries in constant memory in vanilla IO"
DESCRIPTION = "Reading of directory contents in constant memory, i.e. in an iterative fashion \
without storing all directory elements in memory. From another perspective, \
this reading interface allows stopping at any point without loading every \
directory element. \
 \
Also defines general-purpose recursive directory traversals. \
 \
Both Windows and Unix systems are supported."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "ghc-directory-ospath-streaming-0.2.2-2.11.aarch64.rpm"
RPM_HASH = "5fc727b1a17919de466937c5687fdc23794979a4bc0c6cdbf524c35dbf137491a1152d730db529ba2aac4d71d56e7f42c33aeeedfdb2b4e85f8cf52837a95472"

RPROVIDES:${PN} += "ghc-directory-ospath-streaming \
libHSdirectory-ospath-streaming-0.2.2-CPCQJecF0zy6ReoJMTKhf9-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSarray-0.5.8.0-2a42-ghc9.12.4.so \
libHSatomic-counter-0.1.2.4-K5650WCkbBZIqAcUX7ixZ6-ghc9.12.4.so \
libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSbytestring-0.12.2.0-65be-ghc9.12.4.so \
libHSdeepseq-1.5.1.0-1350-ghc9.12.4.so \
libHSexceptions-0.10.12-f655-ghc9.12.4.so \
libHSfilepath-1.5.5.0-b25b-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-boot-th-9.12.4-0605-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libHSmtl-2.3.2-37ef-ghc9.12.4.so \
libHSos-string-2.0.10-5320-ghc9.12.4.so \
libHSpretty-1.1.3.6-b7fd-ghc9.12.4.so \
libHSstm-2.5.3.1-6d74-ghc9.12.4.so \
libHStemplate-haskell-2.23.0.0-358a-ghc9.12.4.so \
libHStime-1.14-a7dc-ghc9.12.4.so \
libHStransformers-0.6.3.0-4709-ghc9.12.4.so \
libHSunix-2.8.8.0-178a-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
