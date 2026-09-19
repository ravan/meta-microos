SUMMARY = "Work with Mac plists at a low level"
DESCRIPTION = "This module is a low-level interface to the Mac OS X Property List (plist) \
format in either XML or binary. You probably shouldn't use this in \
applications–build interfaces on top of this so you don't have to put all \
the heinous multi-level object stuff where people have to look at it. \
 \
You can parse a plist file and get back a data structure. You can take that \
data structure and get back the plist as XML. If you want to change the \
structure inbetween that's your business. :) \
 \
You don't need to be on Mac OS X to use this. It simply parses and \
manipulates a text format that Mac OS X uses. \
 \
If you need to work with the old ASCII or newer JSON formet, you can use \
the *plutil* tool that comes with MacOS X: \
 \
	% plutil -convert xml1 -o ExampleBinary.xml.plist ExampleBinary.plist \
 \
Or, you can extend this module to handle those formats (and send a pull \
request)."
LICENSE = "Artistic-2.0"

PV = "1.602.0"

RPM_NAME = "perl-Mac-PropertyList-1.602.0-1.10.noarch.rpm"
RPM_HASH = "a338b6de6d0cd0bf879216db5ac70c1f914176af92df14f779e44e6dcb6d07852e9863c631fb001dd91f6b71bac635e091ce5459af460d796967cf891f6c1149"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mac--PropertyList \
perl-Mac--PropertyList--Boolean \
perl-Mac--PropertyList--Container \
perl-Mac--PropertyList--Item \
perl-Mac--PropertyList--LineListSource \
perl-Mac--PropertyList--ReadBinary \
perl-Mac--PropertyList--Scalar \
perl-Mac--PropertyList--Source \
perl-Mac--PropertyList--TextSource \
perl-Mac--PropertyList--WriteBinary \
perl-Mac--PropertyList--array \
perl-Mac--PropertyList--data \
perl-Mac--PropertyList--date \
perl-Mac--PropertyList--dict \
perl-Mac--PropertyList--false \
perl-Mac--PropertyList--integer \
perl-Mac--PropertyList--real \
perl-Mac--PropertyList--string \
perl-Mac--PropertyList--true \
perl-Mac--PropertyList--uid \
perl-Mac--PropertyList--ustring \
perl-Mac-PropertyList"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-XML--Entities \
perl-parent"

inherit rpm
