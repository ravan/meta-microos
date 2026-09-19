SUMMARY = "Convert text file to viewable screenplay"
DESCRIPTION = "Screenplain allows you to write a screenplay as a plain text \
file using a format called Fountain. Text files are simple \
and supported by all text manipulation software. It's not \
just for hackers, too. The simplicity of plain text allows \
you to easily view and edit them on devices such as tablets \
and phones. No need for specific screenwriting software. \
 \
The magic that Screenplain performs is to take your plain \
text file and convert it to a good looking screenplay in an \
industry standard format. Send that file off to your producer, \
agent, director or screenwriting competition. Currently, the \
supported output formats are FDX and HTML. PDF will hopefully \
be supported in a not too distant future."
LICENSE = "MIT"

PV = "0.11.1+git.1701424578.13b79f2"

RPM_NAME = "python313-screenplain-0.11.1+git.1701424578.13b79f2-1.11.noarch.rpm"
RPM_HASH = "09a15b232be1d1859db0f15fa90536098331138ee2cdef80fa3956ee1bda173b14ceb0757a5295c814d4480c65bf4534221a285b4e7e21602a08737fb6baa4f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-screenplain \
python3.13dist-screenplain \
python313-screenplain \
python3dist-screenplain"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-reportlab \
update-alternatives"

inherit rpm
