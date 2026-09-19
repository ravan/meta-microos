SUMMARY = "Tools to work with text"
DESCRIPTION = "This package provides handy routines for dealing with text, such as \
wrapping, substitution, trimming, stripping, prefix and suffix removal, \
line continuation, indentation, comment processing, identifier processing, \
values parsing, case insensitive comparison, and more."
LICENSE = "MIT"

PV = "4.3.0"

RPM_NAME = "python314-jaraco.text-4.3.0-1.1.noarch.rpm"
RPM_HASH = "a5e82f933f6e99cb70fe95cde07df42ea8e533501769d8740eb68798f5efecb0eef17b2f208cb8934d785910d722377e2cdce0fcafced8b565007a4e3671b787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.text \
python314-jaraco.text \
python3dist-jaraco.text"

RDEPENDS:${PN} += "python-abi \
python314-autocommand \
python314-inflect \
python314-jaraco.context \
python314-jaraco.functools \
python314-more-itertools \
python314-typer"

inherit rpm
