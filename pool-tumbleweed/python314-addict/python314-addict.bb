SUMMARY = "A dictionary using both attribute and item syntax"
DESCRIPTION = "Addict is a module that exposes a dictionary subclass that allows \
items to be set like attributes. Values are gettable and settable \
using both attribute and item syntax."
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python314-addict-2.4.0-2.5.noarch.rpm"
RPM_HASH = "5a7c2bb507d50af2a0a177bf0136211e130e43f64e65a87307de24d87889f5af595a946c5a692c3a8f0db7dde8cb8f05220602664ee824ccc2356324a8ae9408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-addict \
python314-addict \
python3dist-addict"

RDEPENDS:${PN} += "python-abi"

inherit rpm
