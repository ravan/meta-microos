SUMMARY = "Pure-Python Reed Solomon encoder/decoder"
DESCRIPTION = "A pure-python universal errors-and-erasures Reed-Solomon Codec, based on the wonderful tutorial at Wikiversity, \
written by 'Bobmath' and 'LRQ3000'. If you are just starting with Reed-Solomon error correction codes, \
the Wikiversity article is a good beginner's introduction. This is a burst-type implementation, \
so that it supports any Galois field higher than 2^3, but not binary streams."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python314-reedsolo-1.7.0-2.5.noarch.rpm"
RPM_HASH = "66a3855c91411b52ed7edb096e8feafed505701c53494d6d0d6b068aa0d3f9a31e34c97cc500a9a6ea9e980d7ad7ccf97d132f321d80cbbb6f5af5b0430fa582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-reedsolo \
python314-reedsolo \
python3dist-reedsolo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
