SUMMARY = "Free Chinese-German Dictionary in EDICT Format"
DESCRIPTION = "This is a free Chinese-German dictionary that can be used, for example, \
with Gjiten. \
 \
Everyone is invited to help develop it together with the authors (see \
URL and e-mail addresses in the author list). It is based in large \
parts on CEDICT which in turn has been modelled on Jim Breen's highly \
successful EDICT (Japanese-English dictionary) project. \
 \
 \
 \
Authors: \
-------- \
    Michael Klaus Engel <redaktion@chdw.de> \
    Jan Hefti <redaktion@chdw.de> \
    Helmut Anker <redaktion@chdw.de> \
    Jennifer Gross <redaktion@chdw.de> \
    Julia Mannigel <redaktion@chdw.de> \
    Tian Xiaoyong <redaktion@chdw.de> \
    Steffen Weidenhaus <redaktion@chdw.de> \
    Zhao Chunhua <redaktion@chdw.de> \
    Zheng Meishi <redaktion@chdw.de>"
LICENSE = "CC-BY-SA-3.0 & GPL-2.0+"

PV = "20090318"

RPM_NAME = "handedict-20090318-20.26.noarch.rpm"
RPM_HASH = "a73000b380279131edcb03fefd3cfaabd1ebd833334b2680b4f71becb5c22aee8e9dd046b273f5243c1585141abe8f32bbd222e7ebc43a8acefeccc971f5af73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "handedict \
locale-gjiten-zh"

RDEPENDS:${PN} += ""

inherit rpm
