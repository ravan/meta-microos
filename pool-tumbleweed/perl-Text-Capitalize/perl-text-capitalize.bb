SUMMARY = "Capitalize strings ('to WORK AS titles' becomes 'To Work as Titles')"
DESCRIPTION = "Text::Capitalize provides some routines for *title-like* formatting of \
strings. \
 \
The simple *capitalize* function just makes the inital character of each \
word uppercase, and forces the rest to lowercase. \
 \
The *capitalize_title* function applies English title case rules (discussed \
below) where only the 'important' words are supposed to be capitalized. \
There are also some customization features provided to allow the user to \
choose variant rules. \
 \
Comparing *capitalize* and *captialize_title*: \
 \
  Input:             'lost watches of splitsville' \
  capitalize:        'Lost Watches Of Splitsville' \
  capitalize_title:  'Lost Watches of Splitsville' \
 \
Some examples of formatting with *capitalize_title*: \
 \
  Input:             'KiLLiNG TiMe' \
  capitalize_title:  'Killing Time' \
 \
  Input:             'we have come to wound the autumnal city' \
  capitalize_title:  'We Have Come to Wound the Autumnal City' \
 \
  Input:             'ask for whom they ask for' \
  captialize_title:  'Ask for Whom They Ask For' \
 \
Text::Capitalize also provides some functions for special effects such as \
*scramble_case*, which typically would be used for this sort of \
transformation: \
 \
  Input:            'get whacky' \
  scramble_case:    'gET wHaCkY'  (or something similar)"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.500.0"

RPM_NAME = "perl-Text-Capitalize-1.500.0-1.9.noarch.rpm"
RPM_HASH = "b170384a9f28e82183c9e8f8b8e0ad856af487060975600ff59d757024b94d678ee2bee550284e3cb170e7a427de79bcbddb5aeafc3433d36b4c21301e619ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Capitalize \
perl-Text-Capitalize"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
