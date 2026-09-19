SUMMARY = "Textwrap, but savvy to ANSI colors and styles"
DESCRIPTION = "Ansiwrap wraps text, like the standard textwrap module. \
But it also correctly wraps text that contains ANSI control \
sequences that colorize or style text. \
 \
Where textwrap is fooled by the raw string length of those control codes, \
ansiwrap is not; it understands that however much those codes affect color \
and display style, they have no logical length."
LICENSE = "Apache-2.0"

PV = "0.8.4"

RPM_NAME = "python313-ansiwrap-0.8.4-5.9.noarch.rpm"
RPM_HASH = "d502c924baa23a375bf7e1971c6c1f3bdf9416db051432ec60f83c22d8c28c15075887afc62830d2b7c537c8e41e33c53f0288c0c87d1276cebed07595ad8335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansiwrap \
python3.13dist-ansiwrap \
python313-ansiwrap \
python3dist-ansiwrap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
