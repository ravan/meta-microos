SUMMARY = "Portuguese language stemming"
DESCRIPTION = "This module implements a Portuguese stemming algorithm proposed in the \
paper *A Stemming Algorithm for the Portuguese Language* by *Moreira, V.* \
and *Huyck, C.* \
 \
The eight steps of stemming algorithm are listed as follows: \
 \
* * Plural Reduction \
 \
* * Feminine Reduction \
 \
* * Adverb Reduction \
 \
* * Augmentative/Diminutive Reduction \
 \
* * Noun Suffix Reduction \
 \
* * Verb Suffix Reduction \
 \
* * Vowel Reduction \
 \
* * Accents Removal"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.02"

RPM_NAME = "perl-Lingua-PT-Stemmer-0.02-1.41.noarch.rpm"
RPM_HASH = "8aa9f7f004ae2adb819d00e58ce0b7e4bea6212c8db1ac8d9005ec920ddb728260240a95d505151c44d4e9dc23a7953df71287c7e6cc4954e1612fe66fa5a091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--GL--Stemmer \
perl-Lingua--PT--Stemmer \
perl-Lingua-PT-Stemmer"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
