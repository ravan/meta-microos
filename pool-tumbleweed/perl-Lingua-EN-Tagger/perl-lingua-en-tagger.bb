SUMMARY = "Part-of-speech tagger for English natural language processing"
DESCRIPTION = "The module is a probability based, corpus-trained tagger that assigns POS \
tags to English text based on a lookup dictionary and a set of probability \
values. The tagger assigns appropriate tags based on conditional \
probabilities - it examines the preceding tag to determine the appropriate \
tag for the current word. Unknown words are classified according to word \
morphology or can be set to be treated as nouns or other parts of speech. \
 \
The tagger also extracts as many nouns and noun phrases as it can, using a \
set of regular expressions."
LICENSE = "GPL-3.0-only"

PV = "0.31"

RPM_NAME = "perl-Lingua-EN-Tagger-0.31-1.32.aarch64.rpm"
RPM_HASH = "0231b1d5ce14982078a542114287cd18e87b7e0a799cdda8ab7af52d6da5cf6578885a5eb66288fa2eab794b34fa33955115867068e9b56e4772e6752d00d142"

RPROVIDES:${PN} += "perl-Lingua--EN--Tagger \
perl-Lingua-EN-Tagger"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-HTML--Parser \
perl-HTML--Tagset \
perl-Lingua--Stem \
perl-Memoize--ExpireLRU"

inherit rpm
