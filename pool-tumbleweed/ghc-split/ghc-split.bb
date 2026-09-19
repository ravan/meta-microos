SUMMARY = "Combinator library for splitting lists"
DESCRIPTION = "A collection of various methods for splitting lists into parts, akin to the \
'split' function found in several mainstream languages. Here is its tale: \
 \
Once upon a time the standard 'Data.List' module held no function for splitting \
a list into parts according to a delimiter. Many a brave lambda-knight strove \
to add such a function, but their striving was in vain, for Lo, the Supreme \
Council fell to bickering amongst themselves what was to be the essential \
nature of the One True Function which could cleave a list in twain (or thrain, \
or any required number of parts). \
 \
And thus came to pass the split package, comprising divers functions for \
splitting a list asunder, each according to its nature. And the Supreme Council \
had no longer any grounds for argument, for the favored method of each was \
contained therein. \
 \
To get started, see the 'Data.List.Split' module."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "ghc-split-0.2.5-1.16.aarch64.rpm"
RPM_HASH = "9704433bd000782e21ed29ff96f2c4b7a3e569fd237dfbedb55bce2daea37de945a54228f1053127df51a75fe9d50cc952e6f6d1f30a1e58f7d55b205fa9638b"

RPROVIDES:${PN} += "ghc-split \
libHSsplit-0.2.5-DF0qBqNymX3Hv5Ta0307xc-ghc9.12.4.so"

RDEPENDS:${PN} += "libHSbase-4.21.2.0-8844-ghc9.12.4.so \
libHSghc-bignum-1.3-03b0-ghc9.12.4.so \
libHSghc-internal-9.1204.0-f1e1-ghc9.12.4.so \
libHSghc-prim-0.13.0-f55c-ghc9.12.4.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
